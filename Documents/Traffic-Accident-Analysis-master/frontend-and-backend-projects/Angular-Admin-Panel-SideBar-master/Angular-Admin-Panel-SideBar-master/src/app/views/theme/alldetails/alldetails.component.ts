import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { ActivatedRoute, Router } from '@angular/router';

@Component({
  selector: 'app-alldetails',
  templateUrl: './alldetails.component.html',
  styleUrls: ['./alldetails.component.scss']
})
export class AlldetailsComponent implements OnInit {
id:any;
vehicle:any;
  constructor(private http: HttpClient, private actRoute: ActivatedRoute, private router: Router) { }

  ngOnInit() {

    this.id = this.actRoute.snapshot.paramMap.get('id');
    this.getAccident(this.id);
  }
  getAccident(id:any): void {    
    const rooturl = 'http://localhost:8080/trafficaccidentanalysis/accident/vehicles';   
     this.http.get(rooturl + '/' + id).subscribe(data => {        
      this.vehicle = data;        
       console.log(this.vehicle);                    
        })
  }

}
