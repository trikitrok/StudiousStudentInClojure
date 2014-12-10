(ns studious-student.core-test
  (:use midje.sweet)
  (:use [studious-student.core]))

(facts 
  "about Studious student"
  
  (fact 
    "it works for an empty words list"
    (lexic-shortest-concat []) => "")
  
  (fact 
    "it works for trivial non-empty lists"
    
    (lexic-shortest-concat 
      ["facebook" "hacker" "cup" "for" "studious" "students"]) => "cupfacebookforhackerstudentsstudious"
    
    (lexic-shortest-concat 
      ["k" "duz" "q" "rc" "lvraw"]) => "duzklvrawqrc"
  
   (lexic-shortest-concat 
     ["mybea" "zdr" "yubx" "xe" "dyroiy"]) => "dyroiymybeaxeyubxzdr"))