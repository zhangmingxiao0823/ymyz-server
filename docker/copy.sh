#!/bin/sh

# 复制项目的文件到对应docker路径，便于一键生成镜像。
usage() {
	echo "Usage: sh copy.sh"
	exit 1
}


# copy sql
echo "begin copy sql "
cp ../sql/ry_20230706.sql ./mysql/db
cp ../sql/ry_config_20220929.sql ./mysql/db

# copy html
echo "begin copy html "
cp -r ../ymyz-ui/dist/** ./nginx/html/dist


# copy jar
echo "begin copy ymyz-gateway "
cp ../ymyz-gateway/target/ymyz-gateway.jar ./ruoyi/gateway/jar

echo "begin copy ymyz-auth "
cp ../ymyz-auth/target/ymyz-auth.jar ./ruoyi/auth/jar

echo "begin copy ymyz-visual "
cp ../ymyz-visual/ymyz-monitor/target/ymyz-visual-monitor.jar  ./ruoyi/visual/monitor/jar

echo "begin copy ymyz-modules-system "
cp ../ymyz-modules/ymyz-system/target/ymyz-modules-system.jar ./ruoyi/modules/system/jar

echo "begin copy ymyz-modules-file "
cp ../ymyz-modules/ymyz-file/target/ymyz-modules-file.jar ./ruoyi/modules/file/jar

echo "begin copy ymyz-modules-job "
cp ../ymyz-modules/ymyz-job/target/ymyz-modules-job.jar ./ruoyi/modules/job/jar

echo "begin copy ymyz-modules-gen "
cp ../ymyz-modules/ymyz-gen/target/ymyz-modules-gen.jar ./ruoyi/modules/gen/jar

