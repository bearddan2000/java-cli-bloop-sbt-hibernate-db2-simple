# java-cli-bloop-sbt-hibernate-db2-simple

## Description
A POC for connecting to a db2 database.

Compiled and ran from build server `bloop`.

# Build note
Dependencies must be compatable with jdk8 or less.

## Tech stack
- bloop
- java
- hibernate
  - db2 connector

## Docker stack
- ibmcom/db2
- bloop-sbt

## To run
`sudo ./install.sh -u`

## To stop
`sudo ./install.sh -d`

## For help
`sudo ./install.sh -h`