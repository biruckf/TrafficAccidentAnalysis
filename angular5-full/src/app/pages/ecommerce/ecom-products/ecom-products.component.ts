import {
	Component,
	Input,
	Output,
	OnInit,
	EventEmitter,
	ViewChild,
	AfterViewInit
} from "@angular/core";
import {DataService} from "../../../shared/services/data/data.service";

@Component({
	selector: ".content_inner_wrapper",
	templateUrl: "./ecom-products.component.html",
	styleUrls: ["./ecom-products.component.scss"]
})
export class EcomProductsComponent implements OnInit{
	rows = [];
	selected = [];
	temp = [];
	searchValue: string = null;
	isSearchActive: boolean = false;
	isToolbarActive: boolean = false;
	itemsSelected: string = "";
	itemCount: number = 0;
	constructor(private dataService: DataService) {
	}

	ngOnInit(){
		this.dataService.getProductTableData()
			.subscribe(data => {
				this.temp = [...data];
				this.rows = data;
			})
	}

	updateFilter(event) {
		const val = event.target.value.toLowerCase();
		// filter our data
		const temp = this.temp.filter(function(d) {
			return d.productTitle.toLowerCase().indexOf(val) !== -1 || !val;
		});
		// update the rows
		this.rows = temp;
		// Whenever the filter changes, always go back to the first page
		//  this.table.offset = 0;
	}
	onSelect({ selected }) {
		//console.log("Select Event", selected, this.selected);
		//console.log(this.selected.length);
		this.selected.splice(0, this.selected.length);
		this.selected.push(...selected);
		if (selected.length == 1) {
			this.isToolbarActive = true;
			this.itemCount = selected.length;
			this.itemsSelected = "Item Selected";
		} else if (selected.length > 0) {
			this.isToolbarActive = true;
			this.itemCount = selected.length;
			this.itemsSelected = "Items Selected";
		} else {
			this.isToolbarActive = false;
		}
	}
	triggerClose(event) {
		this.rows = this.temp;
		this.searchValue = "";
		this.isSearchActive = !this.isSearchActive;
	}
	onActivate(event) {
		//console.log("Activate Event", event);
	}

	add() {
		this.selected.push(this.rows[1], this.rows[3]);
	}

	update() {
		this.selected = [this.rows[1], this.rows[3]];
	}

	remove() {
		this.selected = [];
	}
}
