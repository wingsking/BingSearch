#!/bin/bash
javac -d bin/ -cp ./commons-codec-1.9.jar:./org-json.jar src/bing/*.java 
java -cp ./org-json.jar:./commons-codec-1.9.jar:bin/ bing.BingSearch $1 $2 "$3"

