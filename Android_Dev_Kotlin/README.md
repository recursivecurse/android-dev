Installing Kotlin using snap package:-
$ sudo snap install --classic kotlin

Verifying the Installation:-
kotlinc

Compiling Kt File into a Jar File and Running it Using Java:-
$ kotlinc hello.kt -include-runtime -d hello.jar
$ java -jar hello.jar


Running Kt File Without Building a Jar File:-

$ kotlinc hello.kt
$ kotlin HelloKt

