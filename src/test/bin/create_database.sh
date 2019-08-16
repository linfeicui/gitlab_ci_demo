#!/bin/sh
HOSTNAME="192.168.23.102"  #数据库信息
PORT="3306"
USERNAME="root"
PASSWORD="root123"
DBNAME="test_db_test"  #数据库名称
TABLENAME="test_table_test" #数据库中表的名称
#创建数据库
create_db_sql="create database IF NOT EXISTS ${DBNAME}"
mysql -h${HOSTNAME} -P${PORT} -u${USERNAME} -p${PASSWORD} -e "${create_db_sql}"

