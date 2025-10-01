#!/usr/bin/env sh

##############################################################################
##
##  Gradle start up script for UN*X
##
##############################################################################

# ...existing code...
# This is a minimal gradlew script. For full compatibility, use the official wrapper.

if [ -z "$JAVA_HOME" ]; then
  JAVA_EXE=java
else
  JAVA_EXE="$JAVA_HOME/bin/java"
fi

DIRNAME=$(dirname "$0")

exec "$JAVA_EXE" -jar "$DIRNAME/gradle/wrapper/gradle-wrapper.jar" "$@"
