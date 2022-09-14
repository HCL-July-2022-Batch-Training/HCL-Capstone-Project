import { Component, OnInit } from '@angular/core';
import { ProductServiceService } from 'src/app/service/product-service.service';

@Component({
  selector: 'app-checkout',
  templateUrl: './checkout.component.html',
  //styleUrls: ['./checkout.component.css']
})
export class CheckoutComponent implements OnInit {

   items = this.productService.getItems();

  constructor(
    private productService: ProductServiceService
  ) { }

  ngOnInit(): void {
  }

  checkout(): void{
    this.productService.checkout();
  }

}