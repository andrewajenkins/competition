#!/bin/bash
echo 'running... Moo++'
javac -cp "." MoodularArithmetic.java
java -cp "." MoodularArithmetic MoodularArithmetic.data
rm *.class 2>/dev/null
echo 'fin'
