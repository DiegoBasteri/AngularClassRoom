import { Component, OnInit } from '@angular/core';
import { ClassRoomService } from 'src/app/services/class-room.service';

@Component({
  selector: 'app-class-room',
  templateUrl: './class-room.component.html',
  styleUrls: ['./class-room.component.css']
})
export class ClassRoomComponent implements OnInit{
  
  
  Title: string;
  description: string;

  constructor(private classRoomService: ClassRoomService){

    this.Title = "";
    this.description= "";
  }
  
  
  ngOnInit(): void {
    throw new Error('Method not implemented.');
  }

}
