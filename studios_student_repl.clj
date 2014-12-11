(def words-list ["jibw" "ji" "jp" "bw" "jibw"])

(apply str (sort words-list))

(apply str (sort ["uiuy" "hopji" "li" "j" "dcyi"])) ; dcyihopjijliuiuy

(apply str
       (sort #(compare (str %1 %2) (str %2 %1))
             ["uiuy" "hopji" "li" "j" "dcyi"]))

(sort #(compare (str %1 %2) (str %2 %1))
      words-list)

(apply str
       (sort #(compare (str %1 %2) (str %2 %1))
             words-list));bwjibwjibwjijp

(rest (clojure.string/split-lines (slurp "test/studious_student/studious_student.in")))

(clojure.string/split "9 rgh woqg dmabatgbt qrvpcrx eluunoi sy w wnthqxgkg aimallazuc" #" ")

(map #(rest (clojure.string/split % #" "))
     (rest (clojure.string/split-lines
            (slurp "test/studious_student/studious_student.in"))))


(defn lexic-shortest-concat [words-list]
  (apply str
         (sort
          #(compare (str %1 %2) (str %2 %1))
          words-list)))

(map lexic-shortest-concat
     (map #(rest (clojure.string/split % #" "))
          (rest (clojure.string/split-lines
                 (slurp "test/studious_student/studious_student.in")))))
(defn file-lines [file-path]
  (rest (clojure.string/split-lines (slurp file-path))))

(defn line-words [line]
  (rest (clojure.string/split line #" ")))

(defn extract-words-lists [file-path]
  (map line-words (file-lines file-path)))

(map lexic-shortest-concat
     (extract-words-lists "test/studious_student/studious_student.in"))
