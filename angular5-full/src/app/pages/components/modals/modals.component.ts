import { Component, Input, Output, EventEmitter } from "@angular/core";
import { GlobalState } from "../../../app.state";
import { ConfigService } from "../../../shared/services/config/config.service";
import { FormControl, Validators } from "@angular/forms";
const EMAIL_REGEX = /^[a-zA-Z0-9.!#$%&’*+/=?^_`{|}~-]+@[a-zA-Z0-9-]+(?:\.[a-zA-Z0-9-]+)*$/;
@Component({
	selector: ".content_inner_wrapper",
	templateUrl: "./modals.component.html",
	styleUrls: ["./modals.component.scss"]
})
export class ModalsComponent {
	@Input() title: string;
	
	@Input() hidden: boolean = false;
	@Input() isValid: boolean = true;
	@Input() showNext: boolean = true;
	@Input() showPrev: boolean = true;

	@Output() onNext: EventEmitter<any> = new EventEmitter<any>();
	@Output() onPrev: EventEmitter<any> = new EventEmitter<any>();
	@Output() onComplete: EventEmitter<any> = new EventEmitter<any>();
	public scrollbarOptions = {
		axis: "y",
		theme: "minimal",
		scrollInertia: 0,
		mouseWheel: { preventDefault: true }
	};
	private _isActive: boolean = false;
	isDisabled: boolean = true;
isCompleted: any;
	email = new FormControl("", [
		Validators.required,
		Validators.pattern(EMAIL_REGEX)
	]);
	@Input("isActive")
	set isActive(isActive: boolean) {
		this._isActive = isActive;
		this.isDisabled = false;
	}

	get isActive(): boolean {
		return this._isActive;
	}
	//Pass form data...
	onStep1Next(event){
		//console.log(this.email.value)
	}
	
	onStep2Next(event){
		
	}
	
	onStep3Next(event){
		
	}
	
	onComplete1(event){
		
	}

}
