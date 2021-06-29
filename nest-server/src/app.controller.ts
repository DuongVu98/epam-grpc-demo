import { Controller, Logger } from '@nestjs/common';
import { GrpcMethod } from '@nestjs/microservices';
import { AppService } from './app.service';

interface UserProtobuf {
  userId: string;
  hotelId: string;
}

interface RoomProtobuf {
  roomId: string;
  roomTypeId: string;
}

@Controller()
export class AppController {
  private logger = new Logger("HotelGrpcController")

  constructor(private readonly appService: AppService) {}

  @GrpcMethod("HotelService", "GetRoomByUser")
  getRoomByUser(user: UserProtobuf): Promise<RoomProtobuf> {
    this.logger.log(`receive request with user: ${JSON.stringify(user)}`)
    return Promise.resolve({roomId: "room2", roomTypeId: "type2"})
  }
}
