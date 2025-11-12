const TestController = {}
const ENV = import.meta.env

const API_URL = `${ENV.VITE_API_PROTOCOL}://${ENV.VITE_API_HOST}:${ENV.VITE_API_PORT}/${ENV.VITE_API_BASE}`

TestController.callToAPI = async () => {
   console.log('Llamando a la API...' + "" + API_URL)
 await fetch(`${API_URL}/test`,{
    method: 'GET',
    headers: {
     'Content-Type': 'application/json',
     'Accept': 'application/json'
    }
 }).then(res => res.json()).then(data => {
    console.log(data)
     }).catch(err => {
      console.error(err)
     });
}
export default TestController