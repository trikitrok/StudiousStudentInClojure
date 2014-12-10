(ns studious-student.core)

(defn lexic-shortest-concat [words-list]
  (apply str 
         (sort 
           #(compare (str %1 %2) (str %2 %1))
           words-list)))
