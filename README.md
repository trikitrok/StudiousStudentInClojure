# studious-student

<pre>
Studious student problem

You've been given a list of words to study and memorize. 
Being a diligent student of language and the arts, 
you've decided to not study them at all and instead make up 
pointless games based on them. One game you've come up with 
is to see how you can concatenate the words to generate 
the lexicographically lowest possible string.

Input

As input for playing this game you will receive a text file 
containing an integer N, the number of word sets you need to play 
your game against. This will be followed by N word sets, each 
starting with an integer M, the number of words in the set, 
followed by M words. All tokens in the input will be separated 
by some whitespace and, aside from N and M, will 
consist entirely of lowercase letters.

Output

Your submission should contain the lexicographically 
shortest strings for each corresponding word set, 
one per line and in order.

Constraints

1 &lt;= N &lt;= 100
1 &lt;= M &lt;= 9
1 &lt;= all word lengths &lt;= 10

Example input

5
6 facebook hacker cup for studious students
5 k duz q rc lvraw
5 mybea zdr yubx xe dyroiy
5 jibw ji jp bw jibw
5 uiuy hopji li j dcyi

Example output

cupfacebookforhackerstudentsstudious
duzklvrawqrc
dyroiymybeaxeyubxzdr
bwjibwjibwjijp
dcyihopjijliuiuy
</pre>

The project uses [Midje](https://github.com/marick/Midje/).

How to run the tests

`lein midje` will run all tests.

`lein midje namespace.*` will run only tests beginning with "namespace.".

`lein midje :autotest` will run all the tests indefinitely. It sets up a
watcher on the code files. If they change, only the relevant tests will be
run again.
