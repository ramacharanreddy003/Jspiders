let con = document.getElementById("con")
let products = []
let productDetails =""
function fetchData(){
    fetch("https://dummyjson.com/products").then(val=>val.json()
    ).then(res=>{
        products = res.products
        displayData(products)
        localStorage.setItem("product" , JSON.stringify(products) )
    }
)
}
function displayData(prod){
    console.log(prod);
    productDetails=""
    prod.map(val=>{
       productDetails += `
       <div class="card">
          <img src="${val.images[0]}" height="130" width="150" />
          <p>${val.title}</p>
          <p><b>Price :</b> $${val.price}</p>
          <article>
          <main>
           <span>${val.rating}</span>
           <i class="fa-solid fa-star"></i>
          </main>
          <button onclick="viewmore(${val.id})">view more</button>
          </article>
        </div>
       `
    })
    con.innerHTML = productDetails
}

function viewmore(id){
   localStorage.setItem("selectedId",id)
   location.assign("./productView.html")
}

function searchProduct(e){
   console.log(e);
   let searchTerm= e.target.value.toLowerCase()
  let filteredData = products.filter(val=>
    val.title.toLowerCase().includes(searchTerm) ||
    val.category.toLowerCase().includes(searchTerm) 
   )
   displayData(filteredData)
}


document.getElementById("inp").addEventListener("input" , searchProduct)
fetchData()


