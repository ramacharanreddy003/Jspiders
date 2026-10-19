let item = { id: 101, category: "Jewellery", price: 1000, rating: 4.5, image: "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTec6aHWI2RHPnloydVXmGJpkPKBfqSCwrbyOatzF_yNg&s=10" };
let item2 = {
    id: 102,
    category: "Shirt",
    price: 650,
    rating: 4.0,
    image: "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcT71Z-pVeLk8Yh0vsvHwsRhKIzhQlIuWyOtnRpAFYlXbg&s=10"
};
let item3 = {
    id: 103,
    category: "Book",
    price: 60,
    rating: 4.5,
    image: "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTbtzEQbCQ0lqSBUUGkwEiqzvvpexiWsPiLyIcilPC30KLU9SrXA-2WgD4&s=10"

};
let item4 = {
    id: 104,
    category: "Pen",
    price: 10,
    rating: 4,
    image: "https://media.istockphoto.com/id/1404678958/photo/ballpoint-pen-isolated-on-white-background.jpg?s=612x612&w=0&k=20&c=tEifAMoSeQpAWZAk7t4XTKzneHH1AGCZCVDZsUfl5K4="
}
let item5={
    id:105,
    category: "Mobile",
    price: 20000,
    rating: 4,
    image:"https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTzmwjeehH9WpITaKb4x8XXlaOFZY27uvx4Is3MOJFbfA&s=10"

}

let htmltablerow =
    `<tr>
        <td>${item.id}</td>
        <td>${item.category}</td>
        <td>${item.price}</td>
        <td>${item.rating}</td>
        <td><img src="${item.image}"width="100" height="100"></td>
    </tr>
    <tr>    
        <td>${item2.id}</td>
        <td>${item2.category}</td>
        <td>${item2.price}</td>
        <td>${item2.rating}</td>
        <td><img src="${item2.image}" width="100" height="100"></td>
    </tr>
    <tr>
        <td>${item3.id}</td>
        <td>${item3.category}</td>
        <td>${item3.price}</td>
        <td>${item3.rating}</td>
        <td><img src="${item3.image}" width="100" height="100"></td>
    </tr>
    <tr>
        <td>${item4.id}</td>
        <td>${item4.category}</td>
        <td>${item4.price}</td>
        <td>${item4.rating}</td>
        <td><img src="${item4.image}" width="50" height="100"</td>

    </tr>
     <tr>
        <td>${item5.id}</td>
        <td>${item5.category}</td>
        <td>${item5.price}</td>
        <td>${item5.rating}</td>
        <td><img src="${item5.image}" width="50" height="100"</td>

    </tr>
    
    `
    ;
console.log(htmltablerow);
document.getElementById("tbody").innerHTML = htmltablerow;
