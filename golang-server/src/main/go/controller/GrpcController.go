package controller

import (
	"context"
	gen "golang-server/src/main/gen/src/main/proto"
	"log"
)

type GrpcController struct {
	gen.EventProducerServer
}

func (controller *GrpcController) SendCommand(ctx context.Context, command *gen.UpdateCommand) (*gen.Response, error) {
	log.Println("receive the update command request")
	return &gen.Response{Message: "thank you"}, nil
}
