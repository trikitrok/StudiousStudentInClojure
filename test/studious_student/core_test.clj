(ns studious-student.core-test
  (:use midje.sweet)
  (:use [studious-student.core]))

(facts 
  "about Studious student"
  
  (fact 
    "it works for an empty words list"
    (lexic-shortest-concat []) => "")
  
  (fact 
    "it works for trivial non-empty words lists"
    
    (lexic-shortest-concat 
      ["facebook" "hacker" "cup" "for" "studious" "students"]) => "cupfacebookforhackerstudentsstudious"
    
    (lexic-shortest-concat 
      ["k" "duz" "q" "rc" "lvraw"]) => "duzklvrawqrc"
    
    (lexic-shortest-concat 
      ["mybea" "zdr" "yubx" "xe" "dyroiy"]) => "dyroiymybeaxeyubxzdr"
    
    (lexic-shortest-concat 
      ["uiuy" "hopji" "li" "j" "dcyi"])=> "dcyihopjijliuiuy")
  
  (fact 
    "it also works for non-trivial word lists"
    
    (lexic-shortest-concat 
      ["jibw" "ji" "jp" "bw" "jibw"]) => "bwjibwjibwjijp")
  
  (fact
    "it reads a file and concatenates the words in each line 
    to generate the lexicographically lowest possible strings"
    
    (lexic-shortest-concat-lines-of 
      "./test/studious_student/studious_student.in") 
    => '("cupfacebookforhackerstudentsstudious"
         "duzklvrawqrc"
         "dyroiymybeaxeyubxzdr"
         "bwjibwjibwjijp"
         "dcyihopjijliuiuy")))