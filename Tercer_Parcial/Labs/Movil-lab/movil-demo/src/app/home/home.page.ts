import { Component } from '@angular/core';
import { NavController } from '@ionic/angular';
import { UserServiceService } from '../user-service.service';

@Component({
  selector: 'app-home',
  templateUrl: 'home.page.html',
  styleUrls: ['home.page.scss'],
})
export class HomePage {
  users: any[] = [];
  constructor(
    public navCtrl: NavController,
    public userService: UserServiceService
  ) {}
  ionViewDidLoad(){
    this.userService.getUsers()
    .subscribe(
      (data) => { // Success
        this.users = data['results'];
      },
      (error) =>{
        console.error(error);
      }
    )
  }
}
