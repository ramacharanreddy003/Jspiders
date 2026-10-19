let items=fetchData();

function displayItems(list)
{
    let eachItem="";

    for(let item of list)
    {
        eachItem=eachItem+`<div class="col">
                                <div class="card">
                                <div class="card-header text-center bg-dark">
                                <img src="${item.imgUrl}" alt="" width=200px; height=250px; />
                            </div>
                             <div class="card-body text-center">
                                 <h2>${item.category}</h2>
                                 <h4>&#8377;${item.price}</h4>
                                <h5>⭐${item.rating}</h5>
                            </div>
                            <button></button>
                        </div>
                        </div>`
    }

    let dataEle=document.querySelector('#data-ele');
    dataEle.innerHTML=eachItem;
}
displayItems(items);

