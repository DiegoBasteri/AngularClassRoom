import { Component, OnInit } from '@angular/core';
import { ClassRoomModel } from 'src/app/model/class-room';
import { ClassRoomService } from 'src/app/services/class-room.service';

@Component({
  selector: 'app-main',
  templateUrl: './main.component.html',
  styleUrls: ['./main.component.css']
})
export class MainComponent implements OnInit{
  
  classList: ClassRoomModel[] = [];

  className: string;
  classDescription: string;
  
  constructor(private classRoomService: ClassRoomService){

    this.className = "";
    this.classDescription = "";
  }
  
  ngOnInit(): void {
  this.fecthAllClasses()
  }

  fecthAllClasses(){
    this.classRoomService.getClassRoom().subscribe(result => {
      console.log(result)
      this.classList = result
    })
  }

  


}
