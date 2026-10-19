let form = document.getElementById("form")

form.addEventListener("submit" , (e)=>{
    e.preventDefault()
    let mail = document.getElementById("email").value
    let pasword = document.getElementById("password").value
    console.log(mail);
    console.log(pasword);
    let user = JSON.parse(localStorage.getItem("list")) || []
    let res = JSON.parse(localStorage.getItem("list"))
   let a =  res.find(val=> val.email == mail || val.password == pasword)
   if(a){
     alert("already user exist")
   }else{
       user.push({email:mail , password:pasword})
   }
    localStorage.setItem("list" , JSON.stringify(user)  )
   location.assign("./login.html")
})