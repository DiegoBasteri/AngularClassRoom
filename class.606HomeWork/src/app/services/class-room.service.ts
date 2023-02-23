import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { ClassRoomModel} from '../model/class-room';

@Injectable({
  providedIn: 'root'
})
export class ClassRoomService {
  private readonly baseurl = 'http://localhost:8080/api'

  constructor(private http:HttpClient) { }

  getClassRoom(): Observable<ClassRoomModel[]>{
    return this.http.get<ClassRoomModel[]>(this.baseurl+"/getAllClassRooms")
  }
}
