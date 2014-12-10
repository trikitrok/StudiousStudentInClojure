(ns studious-student.core)

(defn lexic-shortest-concat [words-list]
  (apply str (sort words-list)))
