@echo off
setlocal

set DIRNAME=%~dp0
set JAVA_EXE=java
if not "%JAVA_HOME%"=="" set JAVA_EXE=%JAVA_HOME%\bin\java

"%JAVA_EXE%" -jar "%DIRNAME%gradle\wrapper\gradle-wrapper.jar" %*
