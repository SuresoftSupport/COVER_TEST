echo off
rem del D:\apache-tomcat-8.5.28\webapps\cover-demo.war

sleep 10

copy /y "cover-demo.war" "D:\apache-tomcat-8.5.28\webapps\cover-demo.war"


echo DEPLOY!!! "cover-demo.war"


pause
