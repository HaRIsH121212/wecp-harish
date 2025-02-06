import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
<<<<<<< HEAD
import { HttpClientModule, HTTP_INTERCEPTORS } from '@angular/common/http';
import { AppComponent } from './app.component';
import { AppRoutingModule } from './app-routing.module';  
import { AuthInterceptor } from './auth.interceptors';
=======
import { HttpClientModule } from '@angular/common/http';
import { AppComponent } from './app.component';
import { AppRoutingModule } from './app-routing.module';  
>>>>>>> 1e477257c951fd34a277dae7c497465b61ae0a5b

@NgModule({
  declarations: [
    AppComponent
  ],
  imports: [
    BrowserModule,
    HttpClientModule,
    AppRoutingModule 
  ],
<<<<<<< HEAD
  providers: [
    {
      provide: HTTP_INTERCEPTORS,
      useClass: AuthInterceptor,
      multi: true
    }
  ],
=======
  providers: [],
>>>>>>> 1e477257c951fd34a277dae7c497465b61ae0a5b
  bootstrap: [AppComponent]
})
export class AppModule {}
