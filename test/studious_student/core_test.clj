(ns studious-student.core-test
  (:use midje.sweet)
  (:use [studious-student.core]))

(facts 
  "about Studious Student exercise"
  
  (facts 
    "about concatenating the words in a list of words 
    to generate the lexicographically lowest possible string"
    
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
        ["jibw" "ji" "jp" "bw" "jibw"]) => "bwjibwjibwjijp"))
  
  (facts 
    "about concatenating the words in each line of a file 
    to generate the lexicographically lowest possible strings"
    
    (fact
      "it reads a file and concatenates the words in each line 
      to generate the lexicographically lowest possible strings"
      
      (lexic-shortest-concat-lines 
        "./test/studious_student/studious_student.in") 
      => '("cupfacebookforhackerstudentsstudious"
           "duzklvrawqrc"
           "dyroiymybeaxeyubxzdr"
           "bwjibwjibwjijp"
           "dcyihopjijliuiuy"))
    
    (let [out "./test/studious_student/s.out"]
      
      (fact 
        "it writes an output files with the lexicographically lowest possible strings
        of the words in each line of a given file"
        
        (do (studious-student "./test/studious_student/studious_student.in" out)
          
          (clojure.string/split-lines (slurp out))) => '("cupfacebookforhackerstudentsstudious"
                                                         "duzklvrawqrc"
                                                         "dyroiymybeaxeyubxzdr"
                                                         "bwjibwjibwjijp"
                                                         "dcyihopjijliuiuy")
        
        (against-background (after :facts (clojure.java.io/delete-file out))))
      
      (fact 
        "it also works for the long given input file"
        
        (do (studious-student "./test/studious_student/studious_student_long.in" out)
          
          (slurp out) => (slurp "./test/studious_student/studious_student_long.out"))
        
        (against-background (after :facts (clojure.java.io/delete-file out)))))))