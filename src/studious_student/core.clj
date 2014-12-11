(ns studious-student.core)

(def ^:private join (partial apply str))

(defn lexic-shortest-concat [words-list]
  (join (sort #(compare (str %1 %2) 
                        (str %2 %1))
              words-list)))

(defn- file-lines [file]
  (rest (clojure.string/split-lines (slurp file))))

(defn- line-words [line]
  (rest (clojure.string/split line #" ")))

(defn- extract-words-lists [file]
  (map line-words (file-lines file)))

(defn lexic-shortest-concat-lines [file]
  (->>
    file
    extract-words-lists
    (map lexic-shortest-concat)))

(defn studious-student [file-in file-out]
  (spit file-out
        (clojure.string/join 
          "\n" 
          (lexic-shortest-concat-lines file-in))))


