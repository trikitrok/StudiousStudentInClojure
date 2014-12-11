(ns studious-student.core)

(defn lexic-shortest-concat [words-list]
  (apply str 
         (sort 
           #(compare (str %1 %2) (str %2 %1))
           words-list)))

(defn- file-lines [file]
  (rest (clojure.string/split-lines (slurp file))))

(defn- line-words [line]
  (rest (clojure.string/split line #" ")))

(defn- extract-words-lists [file]
  (map line-words (file-lines file)))

(defn lexic-shortest-concat-lines-of [file]
  (map lexic-shortest-concat 
       (extract-words-lists file)))

(defn studious-student [file-in file-out]
  (spit 
    file-out
    (clojure.string/join 
      "\n" 
      (lexic-shortest-concat-lines-of file-in))))


