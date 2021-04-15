@echo off
echo < start "" /D "GradleLearn/" gradlew.bat build
cd docker_container
docker build -t gradle_app .
echo "Build complete!"
echo < docker run --name gradle_app -t -i gradle_app
cd ..
exit