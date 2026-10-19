let item = {
    id: 101, category: "Food", price: 120, qty: 0, rating: 4.6,
    imgUrl: "https://assets.cntraveller.in/photos/69afbfab7e29fb1afce3b589/master/w_1600%2Cc_limit/Asian%2520Thali%2520(2).jpg"
};
let item2 = {
    id: 102,
    category: "Mobile",
    price: 20000,
    qty: 0,
    rating: 3.5,
    imgUrl: "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSLXeqxR4n1DxwSGtX67bTFdI-aaNg2eOz1HwIY_yqXXA&s=10",
}
let item3 = {
    id: 103,
    category: "Watch",
    price: 980,
    qty: 0,
    rating: 4.6,
    imgUrl: "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcR-xXe74zF59e3eQn75Tohf4KavZKguIQQkg2RAQDpz9A&s=10",
}
let item4 = {
    id: 104,
    category: "Laptop",
    price: 60000,
    qty: 0,
    rating: 4.5,
    imgUrl: "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQcf0IcHDpyRU1FtlbahSMuVOdB_FF1vH3DvoyadVBGfw&s=10",
}
let item5 = {
    id: 105,
    category: "Realme buds wireless",
    price: 1700,
    qty: 0,
    rating: 4.8,
    imgUrl: "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSzXUeoEQ16xWF4F2d-2wATwKf4K6kUefThTtHYEXuWQQ&s=10",
}


let htmlTableRow = `<tr>
                            <td>${item.id}</td>
                            <td>${item.category}</td>
                            <td>
                                <img src="${item.imgUrl}" width="60px" height="60px" alt="not found">
                            </td>
                            <td>&#8377;${item.price}.00</td>
                            <td>
                                <button onclick="decqty(${item.id})" class="btn">-</button>
                                 <span id="qty-${item.id}">${item.qty}</span>
                                 <button onclick="incqty(${item.id})" class="btn">+</button>
                            </td>
                            <td>⭐${item.rating}</td>
                        </tr>
                        <tr>
                            <td>${item2.id}</td>
                            <td>${item2.category}</td>
                            <td>
                                <img src="${item2.imgUrl}" width="60px" height="60px" alt="not found">
                            </td>
                            <td>&#8377;${item2.price}.00</td>
                             <td>
                                <button onclick="decqty(${item2.id})" class="btn">-</button>
                                 <span id="qty-${item2.id}">${item2.qty}</span>
                                 <button onclick="incqty(${item2.id})" class="btn">+</button>
                            </td>
                            <td>⭐${item2.rating}</td>
                        </tr>
                        <tr>
                            <td>${item3.id}</td>
                            <td>${item3.category}</td>
                            <td><img src="${item3.imgUrl}" width="60px" height="60px" alt="img"></td>
                            <td>&#8377;${item3.price}.00</td>
                             <td>
                                <button onclick="decqty(${item3.id})" class="btn">-</button>
                                 <span id="qty-${item3.id}">${item3.qty}</span>
                                 <button onclick="incqty(${item3.id})" class="btn">+</button>
                            </td>
                            <td>⭐${item3.rating}</td>
                        </tr>
                          <tr>
                            <td>${item4.id}</td>
                            <td>${item4.category}</td>
                            <td><img src="${item4.imgUrl}" width="60px" height="60px" alt="img"></td>
                            <td>&#8377;${item4.price}.00</td>
                            <td>
                                <button onclick="decqty(${item4.id})" class="btn">-</button>
                                 <span id="qty-${item4.id}">${item4.qty}</span>
                                 <button onclick="incqty(${item4.id})" class="btn">+</button>
                            </td>
                            <td>⭐${item4.rating}</td>
                        </tr>
                          <tr>
                            <td>${item5.id}</td>
                            <td>${item5.category}</td>
                            <td><img src="${item5.imgUrl}" width="60px" height="60px" alt="img"></td>
                            <td>&#8377;${item5.price}.00</td>
                             <td>
                                <button onclick="decqty(${item5.id})" class="btn">-</button>
                                 <span id="qty-${item5.id}">${item5.qty}</span>
                                 <button onclick="incqty(${item5.id})" class="btn">+</button>
                            </td>
                            <td>⭐${item5.rating}</td>
                        </tr>


                        
                        
                        
                    `;
document.querySelector("tbody").innerHTML = htmlTableRow;

let items=[item,item2,item3,item4,item5];
//inc
function incqty(id){
    let p=items.find(items=>items.id===id);
    p.qty++;
    document.querySelector("#qty-"+id).innerHTML=p.qty;
}
function decqty(id){

    let p=items.find(items=>items.id===id);
    if(p.qty>0)
    p.qty--;
    document.querySelector("#qty-"+id).innerHTML=p.qty;
}