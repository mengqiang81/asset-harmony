对于项目构建来说，我们不使用buildpacks，而是使用docker镜像来构建，这样可以更好的控制构建过程，以及构建的环境。
docker run -it --rm --name maven -v /Users/QiangWork/Workspace/intime/ali-code/asset-harmony:/home/source -v /Users/QiangWork/.m2:/root/.m2 --entrypoint /bin/bash registry.cn-hangzhou.aliyuncs.com/yintai/gcr:native-image-community-21
在docker内执行
cd /home/source
./mvnw -B clean package -Dmaven.test.skip=true -Pnative
在项目根目录执行
docker build -f deploy/docker/Dockerfile_aot -t intime/asset-harmony-iot:v1 .
docker run -it --rm --name asset-harmony-iot -p 8080:8080 intime/asset-harmony-iot:v1

PS. registry.cn-hangzhou.aliyuncs.com/yintai/gcr:native-image-community-21 是 ghcr.io/graalvm/native-image-community:21 的加速，注意加 --platform linux/amd64，否则用mac直接拉的可能是arm64的镜像，那么运行时也要用arm64的镜像来运行。mac m1拉arm64有个好处是编译速度快很多
