protoc --proto_path=src/main/resources/proto \
  --cpp_out=src/gen/cpp \
  --java_out=src/gen/java \
  --python_out=src/gen/python src/main/resources/proto/*.proto

