#!/bin/bash

#Author: chisj
#Time: 2015.7.22
#Describe: Create Database

#The username of mysql database
USER="root"

#The password of mysql database
PASS="root123"

mysql -h 192.168.23.102 -P 3306 -u $USER -p $PASS << EOF >/dev/null

CREATE DATABASE ${DB_PATH}

EOF
