function display(){
    let cart = JSON.parse(localStorage.getItem("cart"))
    let con = document.getElementById("cont") 
    let totalPrice = document.getElementById("total") 
    console.log(cart);
    let total = 0
    if(cart.length == 0){
        con.innerHTML = `<h1 class="he">Cart is Empty</h1>`
        totalPrice.innerHTML = `<h1>TotalPrice : 0</h1>`
    }else{
        cart.map((val , ind)=>{
           
            
            total += val.price
           con.innerHTML += ` 
           <main>
             <div>
              <img src =${val.images[0]} height="150" width="150" />
              <p>${val.title}</p>
              <p>Brand : ${val.brand}</p>
              <p>Category : ${val.category}</p>
              <p>Price : $${val.price}</p>
              <p>Return Policy : ${val.returnPolicy}</p>
              <p>shippingInformation : ${val.shippingInformation}</p>
              <p>stock : ${val.stock}</p>
              <p>warrantyInformation : ${val.warrantyInformation}</p>
              </div>
              <button onclick="removePro(${ind})">remove</button>
            </main>
           ` 
        
        })
        totalPrice.innerHTML = `<h1>Total Price : $${total.toFixed(2)}</h1>`
    }
}

function removePro(index){
    let cart = JSON.parse(localStorage.getItem("cart")) || []
   cart.splice(index,1)
   localStorage.setItem("cart" , JSON.stringify(cart))
   display()
   location.reload()
}
display()
