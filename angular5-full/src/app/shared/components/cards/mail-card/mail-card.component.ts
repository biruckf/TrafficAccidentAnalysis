import { Component } from "@angular/core";
import { DataService } from "../../../services/data/data.service";

@Component({
	selector: "mail-card",
	templateUrl: "./mail-card.component.html",
	styleUrls: ["./mail-card.component.scss"]
})
export class MailCardComponent {
	listItems;

	constructor(private _DataService: DataService) {
		//console.log(_DataService.getMailCardDemo());

		this._DataService.getMailCardDemo().subscribe(
			res => {
				this.listItems = res;
				//console.log(this.listItems);
			},
			error => console.log("error : " + error)
		);
	}
}
