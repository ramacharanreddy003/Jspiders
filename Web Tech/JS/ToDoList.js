let taskFormEle=document.getElementById('task-form');
let taskInputEle=document.getElementById('task-input');

let tasks=[];
taskFormEle.addEventListener('submit',function(e){
    e.preventDefault();
    let task=taskInputEle.value;
    if(task=="") return;
    let newTaskObj={};
    newTaskObj.id=tasks.length+1;
    newTaskObj.taskName=task;
    tasks.push(newTaskObj);
    displayTasks(tasks);
    taskInputEle.value="";

});

function displayTasks(arr){
    if(arr.length==0){
        document.getElementById('tasklist-ele').innerText="Your Todo List Is Empty, Please Add Tasks....";
        return;
    }
    let eachTask='';
    
    for(let obj of arr){
        eachTask+=`<li class="list-group-item list-group-item-warning mb-2">
        <span class="fw-bold">${obj.taskName}</span>
        <button class="btn btn-warning text-white float-end btn-sm" onclick="updateTask(${obj.id})">Update</button>
        <button class="btn btn-warning text-white float-end btn-sm me-2" onclick="deleteTask(${obj.id})">Delete</button> </li>`
    }
    document.getElementById('tasklist-ele').innerHTML=eachTask;
}
displayTasks(tasks);

//update task
let taskId=null;
function updateTask(id){
    taskId=id;

    //selecting element
    let selectedTask=tasks.find((val)=>{
        return val.id==id;
    });
    let eleIndex=tasks.indexOf(selectedTask);
    taskInputEle.value=selectedTask.taskName;
}
function saveUpdatedTask()
{
    //selecting element
    let selectedTask=tasks.find((val)=>{
        return val.id==taskId;
    });
    if(taskInputEle.value=="") return;
    selectedTask.taskName=taskInputEle.value;

    let eleIndex=tasks.indexOf(selectedTask);
    tasks.splice(eleIndex,1,selectedTask);

    taskInputEle.value="";
    displayTasks(tasks);

}
let saveBtn=document.getElementById('save-btn');
saveBtn.addEventListener('click',saveUpdatedTask);

//delete task
function deleteTask(id){
    //selecting element
    let selectedTask=tasks.find((val)=>{
        return val.id==id;
    });

    //find index of selected element
    let eleIndex=tasks.indexOf(selectedTask);

    //removing element from array
    tasks.splice(eleIndex,1);

    //after removing updating user interface
    displayTasks(tasks);
}
