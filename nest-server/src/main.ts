import { NestFactory } from '@nestjs/core';
import { Transport } from '@nestjs/microservices';
import { join } from 'path';
import { AppModule } from './app.module';

async function bootstrap() {
  const app = await NestFactory.create(AppModule);

  const grpcApp = await NestFactory.createMicroservice(AppModule, {
    transport: Transport.GRPC,
    options: {
        url:"localhost:9092",
        package: 'hotelservice',
        protoPath: join(__dirname, 'proto/hotel-service.proto'),
    },
  });

  await app.listen(3000);
  await grpcApp.listen(() => {
      console.log("grpc server listen on port 9092")
  });
}
bootstrap();
