package main

import (
	"fmt"
	gen "golang-server/src/main/gen/src/main/proto"
	"golang-server/src/main/go/controller"
	"google.golang.org/grpc"
	"log"
	"net"
)

func main() {
	go GrpcConfig()
	for {}
}

func GrpcConfig() {
	grpcPort := "9092"
	lis, err := net.Listen("tcp", fmt.Sprintf(":%s", grpcPort))
	if err != nil {
		log.Fatalf("Failed to listen on port %s: %v", grpcPort, err)
	}

	grpcServer := grpc.NewServer()
	grpcController := controller.GrpcController{}
	gen.RegisterEventProducerServer(grpcServer, &grpcController)
	log.Printf("grpc listening on port %v", grpcPort)
	if err := grpcServer.Serve(lis); err != nil {
		log.Fatalf("failed to serve grpc server on port %s: %v", grpcPort, err)
	}
}