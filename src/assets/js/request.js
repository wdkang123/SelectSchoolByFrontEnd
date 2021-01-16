import axios from 'axios'
import qs from 'qs'

const service = axios.create({
  baseURL: 'http://localhost:8080',
  timeout: 10000,
  headers: {
    token: window.localStorage.getItem('token')
  }
})

// 创建get
function get (url, params, headers) {
  const options = {}
  if (params) {
    options.params = params
  }
  if (headers) {
    options.headers = headers
  }
  return service.get(url, options)
}

// 创建post
function post (url, data, headers) {
  const options = {}
  if (headers) {
    options.headers = headers
  }
  return service.post(url, qs.stringify(data), options)
}

// 将请求挂在到全局
export default {
  install (Vue) {
    Object.defineProperty(Vue.prototype, '$get', { value: get })
    Object.defineProperty(Vue.prototype, '$post', { value: post })
  }
}
