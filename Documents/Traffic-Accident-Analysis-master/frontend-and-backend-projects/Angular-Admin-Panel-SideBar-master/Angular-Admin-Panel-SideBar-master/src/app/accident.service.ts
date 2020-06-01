import { Injectable } from '@angular/core';
import {HttpClient, HttpHeaders} from '@angular/common/http';
import {Observable} from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class AccidentService {

  constructor( private http:HttpClient) { }

  public getAccident(accident){
    return this.http.get("http://localhost:8080/trafficaccidentanalysis/accident/getall");
 

  }
}
