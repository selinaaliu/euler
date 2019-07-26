# based on http://profesores.elo.utfsm.cl/~agv/elo329/Java/javamakefile.html
JFLAGS = -g
JC = javac
.SUFFIXES: .java .class
.java.class: 
  $(JC) $(JFLAGS) $*.java

CLASSES = Problem01.java

default: classes

classes: $(CLASSES:.java=.class)

clean: 
  $(RM) *.class
