(ns studious-student.core-test
  (:use midje.sweet)
  (:use [studious-student.core]))

(facts 
  "about Studious student"
  
  (fact 
    "it works for an empty words list"
    (lexic-shortest-concat []) => ""))