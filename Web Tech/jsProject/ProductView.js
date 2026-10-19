let selectedId = localStorage.getItem("selectedId")
let products =JSON.parse(localStorage.getItem("product"))
let con = document.getElementById("con")
let selectedProduct = products.find((val)=> val.id == selectedId)
console.log(selectedProduct);

console.log(selectedId);

if(selectedProduct){
    con.innerHTML = `
       <div class="first">
          <img src=${selectedProduct.images[0]} height="200" width="200" />
          <main>
          <h2>${selectedProduct.title}</h2>
          <p><b>Brand :</b> ${selectedProduct.brand}</p>
          <p><b>Price :</b> $${selectedProduct.price}</p>
          <p><b>Description :</b>${selectedProduct.description}</p>
          <button class="add">Add to cart</button>
          <a href="./Home.html"><button class="back">Back to Home</button></a>
          </main>
       </div>
       <div class="second">
         <h1>Customer Reviews</h1>
         ${selectedProduct.reviews.map(val=>`
            <aside>
               <p>${'💗'.repeat(val.rating)}${"🖤".repeat(5-val.rating)} </p>
               <p>${val.comment}</p>
               <p>by ${val.reviewerName} on ${new Date(val.date).toLocaleDateString()}</p>
               </aside>
            `).join("")}
       </div>
    `

    document.querySelector(".add").addEventListener("click",()=>{
       addToCart(selectedProduct)
    })
}else{
    con.innerHTML = `<h1>No Product Selected</h1> `
}


function addToCart(selected){
   let cart = JSON.parse(localStorage.getItem("cart")) || []
   cart.push(selected)
   localStorage.setItem("cart" , JSON.stringify(cart))
   alert("Product added to the cart")
}