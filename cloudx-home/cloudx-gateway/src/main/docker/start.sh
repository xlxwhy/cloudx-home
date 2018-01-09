
############################################################################################
## INPUT: 
##  [1] NONE.
##  [2] NONE.
## ==========================================
## VAR: 
##  [1] ANAME: app name
##  [2] ARGUMENTS: jvm arguments
############################################################################################

ANAME=cloudx-gate
ARGUMENTS=""

## SERVER
##>==================================================================
ARGUMENTS="$ARGUMENTS -server -Xms128m -Xmx256m "
ARGUMENTS="$ARGUMENTS -Djava.security.egd=file:/dev/./urandom "

## EXECUTE
##>==================================================================
java $ARGUMENTS -jar /app/$ANAME.jar
