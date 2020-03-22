import {Injectable} from "@angular/core";
import {Observable} from "rxjs/Observable";

import "rxjs/Rx";
import "rxjs/add/operator/map";
import "rxjs/add/operator/toPromise";
import "rxjs/add/operator/catch";
import {HttpClient} from "@angular/common/http";

@Injectable()
export class DataService {
    constructor(private http: HttpClient) {
    }

    getListCardDemo = (): Observable<any> => {
        return this.http
            .get("/assets/data/ListCardData.json")
    };
    getMailCardDemo = (): Observable<any> => {
        return this.http
            .get("/assets/data/mail/MailCardData.json")
    };
    getMailDemo = (): Observable<any> => {
        return this.http
            .get("/assets/data/mail/MailData.json")
    };
    getProductTableData = () : Observable<any> => {
        return this.http.get(`/assets/data/ecom/productTable.json`)
    };
    addDemoNotes = (): Observable<any> => {
        return this.http
            .get("/assets/data/notes/notes.json")
    };
}
