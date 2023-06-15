import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AboutComponent } from './components/about/about.component';
import { AddTaskComponent } from './components/add-task/add-task.component';
import { TasksComponent } from './components/tasks/tasks.component';
import { TaskDetailComponent } from './components/task-detail/task-detail.component';

const appRoutes: Routes = [
  {path:'', component: TasksComponent},
  {path:'about', component: AboutComponent},
  { path: 'detail/:id', component: TaskDetailComponent },
 // {path: 'add-task', component: AddTaskComponent}
]

@NgModule({
  imports: [RouterModule.forRoot(appRoutes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }