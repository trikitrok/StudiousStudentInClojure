(def words-list ["jibw" "ji" "jp" "bw" "jibw"])

(apply str (sort words-list))

(sort #(compare (str %1 %2) (str %2 %1))
      words-list)

(apply str
       (sort #(compare (str %1 %2) (str %2 %1))
             words-list));bwjibwjibwjijp

;(lexic-shortest-concat
