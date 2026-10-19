let form = document.getElementById("form")

form.addEventListener("submit" , (e)=>{
    e.preventDefault()
    let mail = document.getElementById("email").value
    let pasword = document.getElementById("password").value
    
    let list =JSON.parse(localStorage.getItem("list")) 

    let res =  list.find(val=> val.email == mail && val.password == pasword )
   
   if(res){
    location.assign("./home.html")
   }else{
    alert("invalid credential")
   }
   console.log(list);
    
})