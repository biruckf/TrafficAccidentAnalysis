import { Component, OnInit } from "@angular/core";
import { Validators, FormControl, FormGroup } from "@angular/forms";
import { CustomValidators } from "ng2-validation";
@Component({
	selector: ".content_inner_wrapper",
	templateUrl: "./form-validation.component.html",
	styleUrls: ["./form-validation.component.scss"]
})
export class FormValidationComponent implements OnInit {
	form: FormGroup;
	num: number = 5;

	ngOnInit() {
		let password = new FormControl("", Validators.required);
		let certainPassword = new FormControl(
			"",
			CustomValidators.notEqualTo(password)
		);

		this.form = new FormGroup({
			password: password,
			certainPassword: certainPassword
		});
	}

	onSubmit(form) {
		console.log(form);
	}
}
