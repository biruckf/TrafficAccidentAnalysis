import { Component, OnInit, ViewChild } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { ActivatedRoute, Router } from '@angular/router';


@Component({
  selector: 'app-accidentlist',
  templateUrl: './accidentlist.component.html',
  styleUrls: ['./accidentlist.component.scss']
  
})
export class AccidentlistComponent implements OnInit {
  id:any;
  accidents:any[];
  vehicle:any;
  constructor( private http: HttpClient, private actRoute: ActivatedRoute, private router: Router) { }

  ngOnInit() {
    this.getAccident();
   
         
  }
  getAccident(): void {    
    const rooturl = 'http://localhost:8080/trafficaccidentanalysis/accident/getall';      
     this.http.get<any[]>(rooturl).subscribe(data => {        
      this.accidents = data;        
       console.log(this.accidents);              
  });

  }

  accidentDetail(accidentId:any){

    this.router.navigate(['/theme/alldetails',accidentId]).then(e => {
      if (e) {
        console.log("Navigation is successful!");
      } else {
        console.log("Navigation has failed!");
      }
     });

  }
}
